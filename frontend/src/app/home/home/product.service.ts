import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './model/product';
import {API_URLS} from '../config/api.url.config';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  constructor(private _http:HttpClient) { }
  

  public getProducts():Observable<Product[]>{
    return this._http.get<Product[]>(`${API_URLS.PRODUCTS_URL}/all`);
  }
  
}
