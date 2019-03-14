DESCRIPTION = "rospatlite"
AUTHOR = "Takuya Nakaoka"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs rospy std-msgs rospy"

RDEPENDS_${PN} = "std-msgs rospy"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/rospatlite/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e537ac3b8f2520ec457d2cba747338fe"
SRC_URI[sha256sum] = "f7b0c2e8fb05096688e5c52f1aa6cf20a77025a48a374f8d05ad11a31dd8802b"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-rospatlite-2.1.11-0"

inherit catkin
