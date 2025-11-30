
export class Restaurant{

    private id: number;
    private name: string;
    private opening: string;
    private closing: string;

    public constructor(){

        this.id = 0;
        this.name = ""
        this.opening = "";
        this.closing = "";
    }

    public getId() : number{
       return this.id; 
    }
    
    public setId(id: number){
        this.id = id;
    }

     public getName() : string{
       return this.name; 
    }
    
    public setName(name: string){
        this.name = name;
    }

    public getOpening() : string{
    return this.opening; 
    }
    
    public setOpening(opening: string){
        this.opening = opening;
    }

    public getClosing() : string{
    return this.closing; 
    }
    
    public setClosing(closing: string){
        this.closing = closing;
    }

}
