class Record:
    def __init__(self, record_id, parent_id):
        self.record_id = record_id
        self.parent_id = parent_id


class Node:
    def __init__(self, node_id):
        self.node_id = node_id
        self.children = []


def BuildTree(records):
    if not records:
        return None

    records.sort(key=lambda r: r.record_id)

    # Validate IDs
    for i, record in enumerate(records):
        if record.record_id != i:
            raise ValueError("Record id is invalid or out of order.")

        # Rule 1: parent_id must be smaller
        if record.parent_id > record.record_id:
            raise ValueError("Node parent_id should be smaller than its record_id.")
    
        # Rule 2: only root can have equal parent and record id
        if record.parent_id == record.record_id and record.record_id != 0:
            raise ValueError("Only root should have equal record and parent id.")
    
        # Rule 3: root must point to itself
        if record.record_id == 0 and record.parent_id != 0:
            raise ValueError("Root node must have parent_id 0.")


    # Create nodes
    nodes = {}
    for record in records:
        nodes[record.record_id] = Node(record.record_id)

    # Build tree
    for record in records:
        if record.record_id != 0:
            parent = nodes[record.parent_id]
            child = nodes[record.record_id]
            parent.children.append(child)

    return nodes[0]

