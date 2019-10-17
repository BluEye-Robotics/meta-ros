DESCRIPTION = "This package implements a sound play module using text2wave and aplay through python."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib-msgs actionlib cob-srvs diagnostic-msgs libvlc-dev roscpp std-msgs std-srvs visualization-msgs vlc"

RDEPENDS_${PN} = "message-runtime alsa-oss rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_sound/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fb8f8c009f3f42710f22a1fd92d042ae"
SRC_URI[sha256sum] = "7cce0217a7b85ee31a0d50009a545b4911a2176811eebbf2be9ebad9755f792e"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_sound-0.7.0-1"

inherit catkin
