DESCRIPTION = "rospatlite"
AUTHOR = "Takuya Nakaoka"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs rospy std-msgs rospy"

RDEPENDS_${PN} = "std-msgs rospy"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/rospatlite/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b02756e9f59620611e55c85cc7f3c930"
SRC_URI[sha256sum] = "3527e7681c4e78cc71e78827d13b2bda852c523250f3f85bf554d9e367d45a58"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-rospatlite-2.1.12-2"

inherit catkin
