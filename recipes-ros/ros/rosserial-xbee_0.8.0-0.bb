DESCRIPTION = "Allows multipoint communication between rosserial nodes connected to an xbee. All nodes communicate back to a master xbee connected to a computer running ROS. This software currently only works with Series 1 Xbees. This pkg includes python code from the python-xbee project: http://code. google. com/p/python-xbee/"
AUTHOR = "Adam Stambler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy rosserial-msgs diagnostic-msgs python3-pyserial rosserial-python"

RDEPENDS_${PN} = "rospy rosserial-msgs diagnostic-msgs python3-pyserial rosserial-python"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_xbee/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "71e5e25305517984a19a07c9813b9afe"
SRC_URI[sha256sum] = "6efbc90d56bf2d6caad0e830fe206c9c7cb3c1edfe08507caf2721589f5d7a5b"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_xbee-0.8.0-0"

inherit catkin
