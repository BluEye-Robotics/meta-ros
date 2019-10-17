DESCRIPTION = "The ros client for roboception tag detection modules"
AUTHOR = "Monika Florek-Jasinska"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation curl roscpp std-srvs geometry-msgs visualization-msgs rc-common-msgs tf tf2-geometry-msgs dynamic-reconfigure"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_tagdetect_client/2.6.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aaafaa195717eb48b7808e2d7aec870a"
SRC_URI[sha256sum] = "dc2402b4a4166383d360e5a6cb6cfaea85effbce57f4d8a82afb64fbdea6c346"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_tagdetect_client-2.6.4-1"

inherit catkin
