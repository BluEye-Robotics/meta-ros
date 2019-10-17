DESCRIPTION = "The ros client for roboception grasp generation modules"
AUTHOR = "Monika Florek-Jasinska"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation curl roscpp std-srvs geometry-msgs shape-msgs visualization-msgs tf dynamic-reconfigure tf2-geometry-msgs rc-common-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_pick_client/2.6.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "80d5325468547d0995b146cccfade735"
SRC_URI[sha256sum] = "1625be03ac70ce0df5c78b78e9ecdbb85363708c1e832aa11fbdf06c11589e93"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_pick_client-2.6.4-1"

inherit catkin
