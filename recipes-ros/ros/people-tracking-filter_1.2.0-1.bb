DESCRIPTION = "A collection of filtering tools for tracking people's locations"
AUTHOR = "Caroline Pantofaru"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bfl geometry-msgs message-filters people-msgs roscpp sensor-msgs std-msgs tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/people_tracking_filter/1.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "df3c5c4668876fd35d620f59034908cd"
SRC_URI[sha256sum] = "c248a935edf57a2326396a576622a79a75ec6d74679bf851a35c7004f0b2c8c1"

ROS_SPN = "people"
S = "${WORKDIR}/people-release-release-melodic-people_tracking_filter-1.2.0-1"

inherit catkin
