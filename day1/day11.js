// let obj={name:" mohan ",greet:function(){return "hello"+this.name;}};
// console.log(obj.greet());


// function greet(name){
//     this.name=name;
//     console.log(name);
// }let obj=new greet("kjsdbfe");
// console.log(obj.name);
// let obj1=new greet("jhdgcy");
// let obj2= new greet("hgdsfuye");

//this keyword is used here..
// function details(name, branch, place){
//     this.name=name;
//     this.branch=branch;
//     this.place=place;
//     console.log(this.name+" "+this.branch+" "+this.place);
// }
// let obj=new details("kranthi","cse","karimnagar");
// console.log(obj.name);



// class demo{
//     show(a){
//         console.log(a);
//     }
//     details(){
//       console.log("hello all");
//     }
// }
// let obj=new demo();
// obj.details();
// obj.show("hii");



// class dem{
//     constructor(name,place){
//         this.name=name;
//         this.place=place;
//     }
//     details(){
//         console.log(this.name+" "+this.place);
//     }
// }
// let obj1=new dem("sdcf","wsef");
// obj.details();



//inheritance properties for child class from parent or any other class 
// class  a{
//     sum(a,b){
//         console.log("this is class a");
//         return a+b;
//     }
// }
// class b extends a{
//     detailsb(){
//     console.log("this is class b");
//     super.sum(10,11);
//     }
// }
// let ob= new b();
// ob.detailsb();



// class a{
//     constructor(name,place){
//        this.name=name;
//        this.place=place;
//     }
//     details(){
//         console.log("this is class a");
//         console.log(" this is the worst class and  slow instructor which is irresistable.");
//     }
// }
// class b extends a{
//      constructor(name,place,branch){
//        super(name,place);
//        this.branch=branch;
//     }
//     detailsb(){
//         console.log("this is class b");
//         console.log(this.name+" "+this.place+" "+this.branch);
//         super.details();
//     }
// }
// let obj11= new b("jhsdte","sjhdgf","jhsgdef");
// obj11.detailsb();



// class a{
//     constructor(name,place){
//       this.name=name;
//         this.place=place;
//     }
// }
// class b extends a{
//     details(){
//        console.log(this.name+" "+this.place); 
//     }

// }let obj= new b("sjdhgef","yhejfd");
// obj.details();


let name="jdhmgfv";
let a=parseInt(1982);
let b=parseInt(3765);
console.log("hello "+name+" "+(a+b));
console.log()
