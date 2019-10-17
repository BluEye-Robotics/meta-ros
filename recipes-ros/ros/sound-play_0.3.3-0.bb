DESCRIPTION = "sound_play provides a ROS node that translates commands on a ROS topic ("
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

DEPENDS = "roscpp roslib actionlib-msgs actionlib audio-common-msgs diagnostic-msgs message-generation roscpp roslib actionlib-msgs audio-common-msgs diagnostic-msgs python3-gi gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-ugly gstreamer1.0-plugins-good rospy festival message-runtime"

RDEPENDS_${PN} = "roscpp roslib actionlib-msgs audio-common-msgs diagnostic-msgs python3-gi gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-ugly gstreamer1.0-plugins-good rospy festival message-runtime"

SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/melodic/sound_play/0.3.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7ea1ca687d49bbf014542feb9d6fc41d"
SRC_URI[sha256sum] = "3ac9c2fb8ee7252db6e28c37df5d7591fdee14dbe437408b32cf2d01d10d5ab8"

ROS_SPN = "audio_common"
S = "${WORKDIR}/audio_common-release-release-melodic-sound_play-0.3.3-0"

inherit catkin
