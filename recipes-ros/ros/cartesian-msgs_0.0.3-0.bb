DESCRIPTION = "Stream cartesian commands"
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs message-generation std-msgs geometry-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "geometry-msgs message-runtime std-msgs"

SRC_URI = "https://github.com/PickNikRobotics/cartesian_msgs-release/archive/release/melodic/cartesian_msgs/0.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fa0de57bf0d8e5fc084d949af9301bf6"
SRC_URI[sha256sum] = "25a7fcf876ffdfc7ee4515d150b777726bca7090c6aa689268643c4dc8d4eb73"

S = "${WORKDIR}/cartesian_msgs-release-release-melodic-cartesian_msgs-0.0.3-0"

inherit catkin
