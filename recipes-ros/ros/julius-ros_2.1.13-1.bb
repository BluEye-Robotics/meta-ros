DESCRIPTION = "The julius_ros package"
AUTHOR = "Yuki Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "audio-capture audio-common-msgs julius julius-voxforge nkf python3-lxml python3-rospkg rospy sound-play speech-recognition-msgs std-srvs"

RDEPENDS_${PN} = "audio-capture audio-common-msgs julius julius-voxforge nkf python3-lxml python3-rospkg rospy sound-play speech-recognition-msgs std-srvs"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/julius_ros/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b9df91f6a893269f5a0cd2d5ca52b89b"
SRC_URI[sha256sum] = "fb196df790cede1038b19cdf18ec409fb0d280cdd35dd330691e280d24a657a5"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-julius_ros-2.1.13-1"

inherit catkin
