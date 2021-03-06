package cn.dcg.demo.controller.base;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDTO<T> {

    private String code = SysCode.RET_CODE_SUCC;
    private String description = SysCode.RET_MSG_SUCC;
    private T result;


    public static <T> ResultDTO<T> resultDTOSucc(){
        ResultDTO<T> resultDTO = new ResultDTO<T>();
        resultDTO.setCode(SysCode.RET_CODE_SUCC);
        resultDTO.setDescription(SysCode.RET_MSG_SUCC);
        return resultDTO;
    }
    public static <T> ResultDTO<T> resultDTOSucc(T result){
        ResultDTO<T> resultDTO = new ResultDTO<T>();
        resultDTO.setCode(SysCode.RET_CODE_SUCC);
        resultDTO.setDescription(SysCode.RET_MSG_SUCC);
        resultDTO.setResult(result);
        return resultDTO;
    }
    public static <T> ResultDTO<T> resultDTOError(){
        ResultDTO<T> resultDTO = new ResultDTO<T>();
        resultDTO.setCode(SysCode.SYS_EXCEPTION_CODE);
        resultDTO.setDescription(SysCode.SYS_EXCEPTION_MSG);
        return resultDTO;
    }
    public static <T> ResultDTO<T> resultDTOError(String code, String description){
        ResultDTO<T> resultDTO = new ResultDTO<T>();
        resultDTO.setCode(code);
        resultDTO.setDescription(description);
        return resultDTO;
    }
}
