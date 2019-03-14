DESCRIPTION = "A collection of filtering tools for tracking people's locations"
AUTHOR = "Caroline Pantofaru"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bfl geometry-msgs message-filters people-msgs roscpp sensor-msgs std-msgs tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/people_tracking_filter/1.1.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b9628c1fd7eb3e9b88f57d2ea40e0589"
SRC_URI[sha256sum] = "1a0322dc068da4153612ec54bc60c3d5603217eb160da8c1632fa01c9578eeff"

ROS_SPN = "people"
S = "${WORKDIR}/people-release-release-melodic-people_tracking_filter-1.1.2-0"

inherit catkin
