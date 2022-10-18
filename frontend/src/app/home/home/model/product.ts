export interface Product{
    id:number;
    productName :string;
    productCategory:string;
    productDescription:string;
    imageUrl:string;
    active:boolean;
    unitsinStock:number;
    dateCreated: Date;
    lastUpdated :Date;
}