DESCRIPTION = "This package implements a sound play module using text2wave and aplay through python."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib-msgs actionlib cob-srvs diagnostic-msgs libvlc-dev roscpp std-msgs std-srvs visualization-msgs vlc"

RDEPENDS_${PN} = "message-runtime alsa-oss rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_sound/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "61829c317ba34f4af13033615be9d5ec"
SRC_URI[sha256sum] = "f3b4cfccd643f2f34dee767d57f16726cfd4f3b5ffca6a88e9e6ac655be6ec22"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_sound-0.7.1-1"

inherit catkin
