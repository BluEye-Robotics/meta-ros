DESCRIPTION = "Message definitions for safety_limiter_msgs package"
AUTHOR = "Daiki Maekawa"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/at-wat/neonavigation_msgs-release/archive/release/melodic/safety_limiter_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e9605c3e4919eb48d340606db6064a96"
SRC_URI[sha256sum] = "ce604a0c0ea91871e7e2a7949b792e751fadde6e2570ab4091eb5c63806e9703"

ROS_SPN = "neonavigation_msgs"
S = "${WORKDIR}/neonavigation_msgs-release-release-melodic-safety_limiter_msgs-0.5.0-1"

inherit catkin
