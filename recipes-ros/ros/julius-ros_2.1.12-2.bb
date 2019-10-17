DESCRIPTION = "The julius_ros package"
AUTHOR = "Yuki Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "audio-capture audio-common-msgs julius julius-voxforge nkf python-lxml python-rospkg rospy sound-play speech-recognition-msgs std-srvs"

RDEPENDS_${PN} = "audio-capture audio-common-msgs julius julius-voxforge nkf python-lxml python-rospkg rospy sound-play speech-recognition-msgs std-srvs"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/julius_ros/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4a401634db1e406c2c41d8099bacdee9"
SRC_URI[sha256sum] = "f51d481636c41354f457078cd90b71731ffcf6020f0fc704dc4208145aba5369"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-julius_ros-2.1.12-2"

inherit catkin
