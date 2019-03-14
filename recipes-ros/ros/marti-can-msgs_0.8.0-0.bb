DESCRIPTION = "marti_can_msgs"
AUTHOR = "Elliot Johnson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/melodic/marti_can_msgs/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "07935374948bc2b7aca7c2936c92ab9f"
SRC_URI[sha256sum] = "7b3911514a817dc446751e19aac37c1bcda4e6c4abb47db837c0e77c0d422a53"

ROS_SPN = "marti_messages"
S = "${WORKDIR}/marti_messages-release-release-melodic-marti_can_msgs-0.8.0-0"

inherit catkin
