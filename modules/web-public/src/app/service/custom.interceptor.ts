import { HttpInterceptorFn } from '@angular/common/http';

export const customInterceptor: HttpInterceptorFn = (req, next) => {

  const userToken = localStorage.getItem("token");
  //debugger;
  const cloneRequest = req.clone(
    {
      setHeaders:{
        Authorization: `Bearer ${userToken}`
      }
    }
  );
  return next(cloneRequest);
};
