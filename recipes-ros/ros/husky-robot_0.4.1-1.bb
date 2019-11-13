DESCRIPTION = "Metapackage for Clearpath Husky robot software"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "husky-bringup husky-base"

RDEPENDS_${PN} = "husky-bringup husky-base"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_robot/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ccb31effdcb371b82d7c1920345102c3"
SRC_URI[sha256sum] = "01a169c35acc692f79802efb5f66cbac9f11ca9e0e653fbde85a92242b81eb0f"

ROS_SPN = "husky"
S = "${WORKDIR}/husky-release-release-melodic-husky_robot-0.4.1-1"

inherit catkin
