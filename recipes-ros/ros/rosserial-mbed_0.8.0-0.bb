DESCRIPTION = "rosserial for mbed platforms."
AUTHOR = "Gary Servin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation rospy rosserial-msgs rosserial-client message-runtime"

RDEPENDS_${PN} = "rospy rosserial-msgs rosserial-client message-runtime"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_mbed/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6352bace54580df3226ccf2b04f2b7cd"
SRC_URI[sha256sum] = "b77ce76f551bf7df86c3c333738d6d0778b12de2e7bc656069de475e04345999"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_mbed-0.8.0-0"

inherit catkin
