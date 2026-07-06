import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    dframe=pd.DataFrame(employees)
    return dframe.head(3)
    