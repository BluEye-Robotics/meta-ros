DESCRIPTION = "rospatlite"
AUTHOR = "Takuya Nakaoka"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs rospy std-msgs rospy"

RDEPENDS_${PN} = "std-msgs rospy"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/rospatlite/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "16d5462f8998b8963409c1a875152cb8"
SRC_URI[sha256sum] = "d145440fa3f2a46fbcbe01d3b752bab591ec48822a834acfc113c590c979700e"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-rospatlite-2.1.13-1"

inherit catkin
