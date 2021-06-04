class Product {
int pcode;
String pname;
double price;
String lowestprice(Product p1,Product p2,Product p3) {
if(p1.price<p2.price&&p1.price<p3.price)
{
return p1.pname;
}
else if(p2.price<p1.price&&p2.price<p3.price)
{
return p2.pname;
}
else
{
return p3.pname;
}
}
void val(int pc,String pn,double pr) {
pcode=pc;
pname=pn;
price=pr;
}
}
class ProductPrice {
public static void main(String args[]) {
Product p1=new Product();
Product p2=new Product();
Product p3=new Product();
String lowprice;
p1.val(100,"Lifeboy",25);
p2.val(101,"Magi",12);
p3.val(102,"Colgate",20);
lowprice=p1.lowestprice(p1,p2,p3);
System.out.println("The product having the lowest price is="+lowprice);
}
}
