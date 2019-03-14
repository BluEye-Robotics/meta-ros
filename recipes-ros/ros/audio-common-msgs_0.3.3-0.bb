DESCRIPTION = "Messages for transmitting audio via ROS"
AUTHOR = "Nate Koenig"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

DEPENDS = "message-generation message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/melodic/audio_common_msgs/0.3.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c26a3ecc5b7106f095678bff7f84b99b"
SRC_URI[sha256sum] = "119fea466f5d72ff6fab2bb92fed76cf3665441eb4b6012ff202817c5c42fe02"

ROS_SPN = "audio_common"
S = "${WORKDIR}/audio_common-release-release-melodic-audio_common_msgs-0.3.3-0"

inherit catkin
