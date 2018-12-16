package exception;

public interface ErrorCode {

    int COMMON_ERROR_CODE_START = 0;

    int PLATFORM_ERROR_CODE_START = COMMON_ERROR_CODE_START + 1000;

    int MARKET_ERROR_CODE_START = COMMON_ERROR_CODE_START + 2000;

    int CONSOLE_ERROR_CODE_START = COMMON_ERROR_CODE_START + 3000;

    int APP_NAME_DUPLICATED = CONSOLE_ERROR_CODE_START + 1;


}
