module moduleB


signature:
	enum domain EnumDom = {AA | BB}
	dynamic controlled foo: EnumDom

definitions:
	rule r_b =
		foo := BB