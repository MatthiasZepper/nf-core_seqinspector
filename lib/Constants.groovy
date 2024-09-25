// Class to hold constants

class Constants {

    static enum RunMode {
        FASTQ,
        RUNFOLDER,
    }

    // Define all available tools centrally here

    static enum Tool {
        FASTQSCREEN,
        FASTQC,
        // MULTIQC, // Turning MultiQC off kind of defeats the purpose of the pipeline
    }

    // Define some default profiles for the tool selection

    static Map<String, ToolTracker> ToolProfiles = [

            // Tool trackers do not need to explicitly define all tools

            DEFAULT: new ToolTracker(tool_selection: [FASTQSCREEN: false, FASTQC: true]),

            FULL: new ToolTracker(tool_selection: [FASTQSCREEN: true, FASTQC: true]),

            MINIMAL: new ToolTracker(tool_selection: [FASTQC: true]),

    ]

}
