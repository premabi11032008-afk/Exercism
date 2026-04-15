"""Functions which helps the locomotive engineer to keep track of the train."""


def get_list_of_wagons(*args):
    """Return a list of wagons.

    :param: arbitrary number of wagons.
    :return: list - list of wagons.
    """
    return list(args)


def fix_list_of_wagons(each_wagons_id, missing_wagons):
    """Fix the list of wagons.

    :param each_wagons_id: list - the list of wagons.
    :param missing_wagons: list - the list of missing wagons.
    :return: list - list of wagons.
    """
    each=each_wagons_id[2:]+each_wagons_id[:2]
    i=each.index(1)
    return each[:i+1]+missing_wagons+each[i+1:]
    


def add_missing_stops(routing_dict,**kwargs):
    """Add missing stops to route dict.

    :param route: dict - the dict of routing information.
    :param: arbitrary number of stops.
    :return: dict - updated route dictionary.
    """
    stops = []

    # Loop through all keyword args
    for key, value in kwargs.items():
        # Case 1: value is a dictionary → extract its values
        if isinstance(value, dict):
            # sort keys like stop_1, stop_2 for correct order
            for k in sorted(value):
                stops.append(value[k])
        
        # Case 2: simple key=value stop pair
        else:
            stops.append(value)

    # Add the collected stops to the routing dictionary
    routing_dict["stops"] = stops

    return routing_dict


def extend_route_information(route, more_route_information):
    """Extend route information with more_route_information.

    :param route: dict - the route information.
    :param more_route_information: dict -  extra route information.
    :return: dict - extended route information.
    """
    route.update(more_route_information)
    return  route


def fix_wagon_depot(wagons_rows):
    """Fix the list of rows of wagons.

    :param wagons_rows: list[list[tuple]] - the list of rows of wagons.
    :return: list[list[tuple]] - list of rows of wagons.
    """
    new = []

    # loop through columns of first row
    for j in range(len(wagons_rows[0])):
        new_row = []
        for i in range(len(wagons_rows)):
            new_row.append(wagons_rows[i][j])
        new.append(new_row)

    return new
            
