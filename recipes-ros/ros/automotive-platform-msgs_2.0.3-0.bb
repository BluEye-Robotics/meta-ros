DESCRIPTION = "Generic Messages for Communication with an Automotive Autonomous Platform"
AUTHOR = "Daniel Stanek"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/automotive_autonomy_msgs-release/archive/release/melodic/automotive_platform_msgs/2.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f6b9f43da60198072b727f8f7f1c8b13"
SRC_URI[sha256sum] = "9e9e38d99db9d57b99f5cc554c6062cbec31765a2afe8141ecef0aec3c7f3fda"

ROS_SPN = "automotive_autonomy_msgs"
S = "${WORKDIR}/automotive_autonomy_msgs-release-release-melodic-automotive_platform_msgs-2.0.3-0"

inherit catkin
