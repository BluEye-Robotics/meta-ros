DESCRIPTION = "Outputs audio to a speaker from a source node."
AUTHOR = "Nate Koenig"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

DEPENDS = "roscpp audio-common-msgs gstreamer1.0 gstreamer1.0-plugins-base roscpp audio-common-msgs gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-ugly gstreamer1.0-plugins-good"

RDEPENDS_${PN} = "roscpp audio-common-msgs gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-ugly gstreamer1.0-plugins-good"

SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/melodic/audio_play/0.3.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "21a04faf995db09fcac60310e0278b6c"
SRC_URI[sha256sum] = "a3c3715c6c4d70959103aa529c2e2cdcf46e6a07d500ed262146038ecdcb07c5"

ROS_SPN = "audio_common"
S = "${WORKDIR}/audio_common-release-release-melodic-audio_play-0.3.3-0"

inherit catkin
