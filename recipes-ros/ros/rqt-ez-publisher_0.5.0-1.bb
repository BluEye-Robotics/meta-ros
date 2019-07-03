DESCRIPTION = "The rqt_ez_publisher package"
AUTHOR = "Takashi Ogura"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest python-catkin-pkg rospy rqt-gui rqt-gui-py rqt-py-common tf tf2-msgs geometry-msgs"

RDEPENDS_${PN} = "rospy rqt-gui rqt-gui-py rqt-py-common tf tf2-msgs geometry-msgs"

SRC_URI = "https://github.com/OTL/rqt_ez_publisher-release/archive/release/melodic/rqt_ez_publisher/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8a07654fd42b267f948864c982145e0f"
SRC_URI[sha256sum] = "0ddd9a4715365473360ac5443887e7da747eb8280c7c9f90894f304131582f7a"

S = "${WORKDIR}/rqt_ez_publisher-release-release-melodic-rqt_ez_publisher-0.5.0-1"

inherit catkin
