package hw17;

public enum LoggingLevel {
    INFO,
    DEBUG;
        public boolean allowsLogging(LoggingLevel level) {
            return this.ordinal() >= level.ordinal();
        }
}
