class RangeSearcher :


    def __init__(self):
        '''Class constructor for Range Searcher'''
        self.index = []                        # Initialize index root;

    
    def add(self, document, field):
        indexedValue = convertToListOfChars(document[field]);
        insertToIndex(document, indexString, self.index);


    def insertToIndex(document, indexedValue, root):
        currentIndexPos = indexedValue.pop();


        if indexedValue.length > 1 :
            if root[currentIndexPos].count != null :
                root[currentIndexPos].count + 1
            else :
                root[currentIndexPos].count = 1

            insertToIndex(document, indexedValue, root)
        else :
            if root[currentIndexPos] != null:
                root[currentIndexPos].count + 1
                root[currentIndexPos].documents.append(document)
            else :
                root[currentIndexPos].count = 1
                root[currentIndexPos].documents = [document]

    def convertToListOfChars(value):
        strValue = str(value)
        return list(strValue)
