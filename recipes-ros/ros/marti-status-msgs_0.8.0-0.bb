DESCRIPTION = "marti_status_msgs"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/melodic/marti_status_msgs/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0da800bb01c2e3c640bdb77168190afc"
SRC_URI[sha256sum] = "bd4b4f53d0139048213d1131994307fd26bcbcde7418764247d6253e4bbd2099"

ROS_SPN = "marti_messages"
S = "${WORKDIR}/marti_messages-release-release-melodic-marti_status_msgs-0.8.0-0"

inherit catkin
