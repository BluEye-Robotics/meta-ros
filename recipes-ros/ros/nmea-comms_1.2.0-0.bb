DESCRIPTION = "The nmea_comms package provides helper nodes for transmitting and receiving the NMEA sentences."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roslint nmea-msgs roslaunch rostest roscpp nmea-msgs"

RDEPENDS_${PN} = "roscpp nmea-msgs"

SRC_URI = "https://github.com/ros-drivers-gbp/nmea_comms-release/archive/release/melodic/nmea_comms/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "83e4c3382d0fdf01868227effb3cd3e9"
SRC_URI[sha256sum] = "c8d4fd98cc921339daf7612d5d5b087f1922e0a79dea4561f483cfbb6a1b5db2"

S = "${WORKDIR}/nmea_comms-release-release-melodic-nmea_comms-1.2.0-0"

inherit catkin
