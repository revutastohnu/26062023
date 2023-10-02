package hw17;

public class FileLoggerConfiguration {
        private String file;
        private LoggingLevel level;
        private long maxSize;
        private String format;

        // Getters and Setters
        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public LoggingLevel getLoggingLevel() {
            return level;
        }

        public void setLoggingLevel(LoggingLevel level) {
            this.level = level;
        }

        public long getMaxSize() {
            return maxSize;
        }

        public void setMaxSize(long maxSize) {
            this.maxSize = maxSize;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }
    }
