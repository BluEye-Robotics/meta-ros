DESCRIPTION = "The julius_ros package"
AUTHOR = "Yuki Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "audio-capture audio-common-msgs julius julius-voxforge nkf python-lxml python-rospkg rospy sound-play speech-recognition-msgs std-srvs"

RDEPENDS_${PN} = "audio-capture audio-common-msgs julius julius-voxforge nkf python-lxml python-rospkg rospy sound-play speech-recognition-msgs std-srvs"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/julius_ros/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f48f6658010d97866372e1c26ab373b8"
SRC_URI[sha256sum] = "d3d22ad29aebb346c90c591b7a9afc1c006becfc8a5a377eaba7691a1ee9029a"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-julius_ros-2.1.11-0"

inherit catkin
