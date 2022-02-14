###Spelplanen:
För att hålla koll på spelplanen och vilka platser som är tagna kan man numrera de olika platserna, exempelvist så här:

| 1 | 2 | 3 |\
| 4 | 5 | osv...

Varje plats på spelplanen har ett designerat nummer som den alltid kommer vara hänförad till. Spelaren kommer sedan berätta vilken plats den vill lägga sin ikon på. "Det är O's tur, vilken plats vill du lägga på?", "5", *Uppdeterar 5 till O*. Den minns det nummer samtidigt som den kollar ifall en spelare har tagit just den platsen. 

Därefter kan man använda if-satser för att identifiera om olika rader har blivit tagna av samma spelare. "if (1 = x, 2 = x, 3 = x || 1 = o, 2 = o, 3 = o) {gör grejer (vinn)}".
