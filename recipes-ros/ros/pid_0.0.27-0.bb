DESCRIPTION = "Launch a PID control node."
AUTHOR = "Andy Zelenak"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation roscpp std-msgs dynamic-reconfigure message-runtime roscpp std-msgs dynamic-reconfigure"

RDEPENDS_${PN} = "message-runtime roscpp std-msgs dynamic-reconfigure"

SRC_URI = "https://github.com/AndyZe/pid-release/archive/release/melodic/pid/0.0.27-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c90dd4145fb8f75d0f3b2f979adb7906"
SRC_URI[sha256sum] = "6066703ba3197ee904f55d7e6b1fc054e1901b5ad4d826753061715945a57d62"

S = "${WORKDIR}/pid-release-release-melodic-pid-0.0.27-0"

inherit catkin
