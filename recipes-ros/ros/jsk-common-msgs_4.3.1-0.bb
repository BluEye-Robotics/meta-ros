DESCRIPTION = ""
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "jsk-gui-msgs posedetection-msgs jsk-footstep-msgs jsk-hark-msgs speech-recognition-msgs"

RDEPENDS_${PN} = "jsk-gui-msgs posedetection-msgs jsk-footstep-msgs jsk-hark-msgs speech-recognition-msgs"

SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/melodic/jsk_common_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4524153af8d96ee10dfc634e0f56eb2a"
SRC_URI[sha256sum] = "3b58085e4249a1b809d2e657158c595336460295578ba0cfe369f8006f0cfc85"

S = "${WORKDIR}/jsk_common_msgs-release-release-melodic-jsk_common_msgs-4.3.1-0"

inherit catkin
