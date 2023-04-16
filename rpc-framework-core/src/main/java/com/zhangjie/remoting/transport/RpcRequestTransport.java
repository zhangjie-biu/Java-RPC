package com.zhangjie.remoting.transport;

import com.zhangjie.extension.SPI;
import com.zhangjie.remoting.dto.RpcRequest;

/**
 * send RpcRequest。
 *
 * @author shuang.kou
 * @createTime 2020年05月29日 13:26:00
 */
@SPI
public interface RpcRequestTransport {
    /**
     * send rpc request to server and get result
     *
     * @param rpcRequest message body
     * @return data from server
     */
    Object sendRpcRequest(RpcRequest rpcRequest);
}
