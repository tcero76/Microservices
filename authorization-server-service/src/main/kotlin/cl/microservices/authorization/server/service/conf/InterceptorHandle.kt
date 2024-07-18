package cl.microservices.authorization.server.service.conf

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.servlet.HandlerInterceptor


class InterceptorHandle: HandlerInterceptor {

    private val log: Logger = LoggerFactory.getLogger(InterceptorHandle::class.java)
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        log.info("Method: ${request.method} desde: ${request.requestURL}")
        return super.preHandle(request, response, handler)
    }
}