DESCRIPTION = "The formatters here simply format various input types to a specified text format. They can be used with most streaming types (including both ecl and stl streams)."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-exceptions ecl-converters ecl-license ecl-config ecl-exceptions ecl-converters"

RDEPENDS_${PN} = "ecl-license ecl-config ecl-exceptions ecl-converters"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_formatters/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aee19b7b9d9ac24333f43cff87b57748"
SRC_URI[sha256sum] = "a7f04f361b91c1ef60014240ddc7aacb2a54d37385d89b0163607bc0b536929f"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_formatters-0.62.2-0"

inherit catkin
