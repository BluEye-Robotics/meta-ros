DESCRIPTION = "Transports audio from a source to a destination. Audio sources can come from a microphone or file. The destination can play the audio or save it to an mp3 file."
AUTHOR = "Nate Koenig"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

DEPENDS = "roscpp audio-common-msgs gstreamer1.0 gstreamer1.0-plugins-base roscpp audio-common-msgs gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-good gstreamer1.0-plugins-ugly"

RDEPENDS_${PN} = "roscpp audio-common-msgs gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-good gstreamer1.0-plugins-ugly"

SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/melodic/audio_capture/0.3.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "952046920adf51bfaedef5ef93fe1ed7"
SRC_URI[sha256sum] = "c24552309d44459372bb344e5d02af47ce6f9451329cb1f73e99e57833d734cb"

ROS_SPN = "audio_common"
S = "${WORKDIR}/audio_common-release-release-melodic-audio_capture-0.3.3-0"

inherit catkin
