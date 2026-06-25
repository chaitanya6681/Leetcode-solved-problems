import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    dframe=pd.DataFrame(players)
    d=list(dframe.shape)
    return d
    