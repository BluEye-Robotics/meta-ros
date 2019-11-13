DESCRIPTION = "The roseus_mongo package"
AUTHOR = "Yuki Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mongodb-store mongodb-store-msgs roseus rostest mongodb-store mongodb-store-msgs roseus"

RDEPENDS_${PN} = "mongodb-store mongodb-store-msgs roseus"

SRC_URI = "https://github.com/tork-a/jsk_roseus-release/archive/release/melodic/roseus_mongo/1.7.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6228c5abc829997db38af8ba89c887d6"
SRC_URI[sha256sum] = "c86e4bbe0fc1f27a7c71715c22a50174fd9ba1ba38c47acb80d7c7403e2515d6"

ROS_SPN = "jsk_roseus"
S = "${WORKDIR}/jsk_roseus-release-release-melodic-roseus_mongo-1.7.4-1"

inherit catkin
