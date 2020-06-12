asm main

import ../../../asm_examples/STDL/StandardLibrary
import ../../../CTLlibrary
//import zona
import controller

signature:
	dynamic controlled execZoneAgents: Boolean

definitions:
		
	//deadlock
	axiom over ctl: ag (ex (true))
	
	//safety
	axiom over ctl: ag ((state_valvola(zone01)=OPEN and state_valvola(zone02)=OPEN) implies (state_valvola(zone03)=CLOSED and state_valvola(zone04)=CLOSED and state_valvola(zone05)=CLOSED))
	axiom over ctl: ag ((state_valvola(zone01)=OPEN and state_valvola(zone03)=OPEN) implies (state_valvola(zone02)=CLOSED and state_valvola(zone04)=CLOSED and state_valvola(zone05)=CLOSED))
	axiom over ctl: ag ((state_valvola(zone01)=OPEN and state_valvola(zone04)=OPEN) implies (state_valvola(zone02)=CLOSED and state_valvola(zone03)=CLOSED and state_valvola(zone05)=CLOSED))
	axiom over ctl: ag ((state_valvola(zone01)=OPEN and state_valvola(zone05)=OPEN) implies (state_valvola(zone02)=CLOSED and state_valvola(zone03)=CLOSED and state_valvola(zone04)=CLOSED))
	axiom over ctl: ag ((state_valvola(zone02)=OPEN and state_valvola(zone03)=OPEN) implies (state_valvola(zone01)=CLOSED and state_valvola(zone04)=CLOSED and state_valvola(zone05)=CLOSED))
	axiom over ctl: ag ((state_valvola(zone02)=OPEN and state_valvola(zone04)=OPEN) implies (state_valvola(zone01)=CLOSED and state_valvola(zone03)=CLOSED and state_valvola(zone05)=CLOSED))
	axiom over ctl: ag ((state_valvola(zone02)=OPEN and state_valvola(zone05)=OPEN) implies (state_valvola(zone01)=CLOSED and state_valvola(zone03)=CLOSED and state_valvola(zone04)=CLOSED))
	axiom over ctl: ag ((state_valvola(zone03)=OPEN and state_valvola(zone04)=OPEN) implies (state_valvola(zone01)=CLOSED and state_valvola(zone02)=CLOSED and state_valvola(zone05)=CLOSED))
	axiom over ctl: ag ((state_valvola(zone03)=OPEN and state_valvola(zone05)=OPEN) implies (state_valvola(zone01)=CLOSED and state_valvola(zone02)=CLOSED and state_valvola(zone04)=CLOSED))
	axiom over ctl: ag ((state_valvola(zone04)=OPEN and state_valvola(zone05)=OPEN) implies (state_valvola(zone01)=CLOSED and state_valvola(zone02)=CLOSED and state_valvola(zone03)=CLOSED))
	
	axiom over ctl: ag (((state_activation(zone01) = DISABLED) or (state_sensor(zone01) != NEED)) implies (state_valvola(zone01)=CLOSED))
	axiom over ctl: ag (((state_activation(zone02) = DISABLED) or (state_sensor(zone02) != NEED)) implies (state_valvola(zone02)=CLOSED))
	axiom over ctl: ag (((state_activation(zone03) = DISABLED) or (state_sensor(zone03) != NEED)) implies (state_valvola(zone03)=CLOSED))
	axiom over ctl: ag (((state_activation(zone04) = DISABLED) or (state_sensor(zone04) != NEED)) implies (state_valvola(zone04)=CLOSED))
	axiom over ctl: ag (((state_activation(zone05) = DISABLED) or (state_sensor(zone05) != NEED)) implies (state_valvola(zone05)=CLOSED))
	
	//reachability
	axiom over ctl: ag (ef (state_valvola(zone01)=OPEN))
	axiom over ctl: ag (ef (state_valvola(zone02)=OPEN))
	axiom over ctl: ag (ef (state_valvola(zone03)=OPEN))
	axiom over ctl: ag (ef (state_valvola(zone04)=OPEN))
	axiom over ctl: ag (ef (state_valvola(zone05)=OPEN))
	
	axiom over ctl: eg ((state_valvola(zone05)=OPEN and state_activation(zone05) = ENABLED and state_valvola(zone05)=CLOSED)implies (ag (state_valvola(zone05)=OPEN)))
	
	
	axiom over ctl: ag(((state_valvola(zone01)=CLOSED) and (state_sensor(zone01)=NEED))implies(af (state_valvola(zone01)=OPEN)))
	
	main rule r_Main =
		par
			execZoneAgents := not(execZoneAgents)
			if(execZoneAgents) then
				forall $c in ZoneAgent with true do
					program($c)
			else
				program(maincontroller)
			endif
		endpar

default init s0:

	function state_valvola($c in ZoneAgent) = CLOSED
	function state_activation($c in ZoneAgent) = ENABLED
	function state_sensor($c in ZoneAgent) = DONT_NEED
	function execZoneAgents = false

	agent ZoneAgent:
		r_ZoneAgent[]

	agent ControllerAgent:
		r_ControllerAgent[]
