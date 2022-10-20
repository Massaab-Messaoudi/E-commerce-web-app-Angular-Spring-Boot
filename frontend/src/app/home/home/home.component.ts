import { Component, OnInit } from '@angular/core';
import { Product } from './model/product';
import { ProductService } from './product.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  products: Product[] = [];

  constructor(private productService:ProductService) { }

  ngOnInit(): void {
    this.productService.getProducts().subscribe(
      res=>{
        this.products=res;
        console.log('name of the first products is: '+this.products[0].productName)
      },
      err=> console.log(err)
    )
  }
}
