const selectPlayers = ()=>{

    console.log('Selecting players');
    return new Promise((resolve, reject)=>{

        setTimeout(()=>{
            resolve(['abd', 'ms', 'virat']);
        }, 2000);

    });
}

const startMatch = (players)=>{

    console.log('Match is starting');
    

    //player
    /*
[{name: 'abd', runs: random]
    **/ 
    return new Promise((resolve,reject)=>[
        setTimeout(()=>{
            resolve(
                players.map((p)=>{
                return{
                    name:p,
                    score: Math.floor(Math.random()*100)
                }
            }//object
        ) //map
        )
        },3000)
    ])

}
// const playMatch = async ()=>{}
async function  playMatch(){


    console.log('Match is starting');
    const players = await selectPlayers()
    console.log("players",players);
    const scoreCard = await startMatch(players);
    console.log("scoreCard",scoreCard);


}
playMatch()