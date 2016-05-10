package working.commandtext;

public enum TextCommands {

	CREATE_WITH_CONSOLE
	{
		@Override
		public String toString()
		{
			return "Create text with console enter (current text will be overrided)";
		}
	},
	CREATE_WITH_FILE
	{
		@Override
		public String toString()
		{
			return "Create text with file (only .txt supported, current text will be overrided)";
		}
	}, 
	CLEAR
	{
		@Override
		public String toString()
		{
			return "Clear working text";
		}
	},
	EXIT;
	
	/**
	 * Method for getting TextCommands by its ordinal
	 * @param ordinal - of required TextCommands
	 * @return TextCommands corresponded to ordinal parameter <br/>
	 * null if no such TextCommands
	 */
	public static TextCommands getCommang(int ordinal)
	{
		
		for(TextCommands each : TextCommands.values())
		{
			if (each.ordinal() == ordinal)
			{
				return each;
			}
		}
		
		return null;
	}
}
