package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TourTable extends JFrame {

    private JTable tourTable;
    private DefaultTableModel tableModel;
    private JTextField searchField;
    private JButton searchButton;

    public TourTable() {
        super("Danh sách Tour");

        // Khởi tạo bảng và model
        tourTable = new JTable();
        tableModel = new DefaultTableModel(new Object[]{"ID", "Tên Tour", "Khu vực", "Số ngày", "Số lượng"}, 0);
        tourTable.setModel(tableModel);

        // Thêm dữ liệu mẫu
        tableModel.addRow(new Object[]{"1", "Tour Đà Nẵng - Hội An", "Miền Trung", "5", "10"});
        tableModel.addRow(new Object[]{"2", "Tour Hạ Long - Sapa", "Bắc Bộ", "7", "15"});
        tableModel.addRow(new Object[]{"3", "Tour Nha Trang - Đà Lạt", "Miền Trung", "6", "12"});

        // Thêm thanh search vào bên trên bảng
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        searchField = new JTextField(20);
        searchButton = new JButton("Tìm kiếm");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText();
                List<Integer> rows = new ArrayList<>();
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    for (int j = 0; j < tableModel.getColumnCount(); j++) {
                        if (tableModel.getValueAt(i, j).toString().contains(searchText)) {
                            rows.add(i);
                            break;
                        }
                    }
                }
                if (!rows.isEmpty()) {
                    tourTable.setRowSelectionInterval(rows.get(0), rows.get(rows.size() - 1));
                }
            }
        });
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        add(searchPanel, BorderLayout.NORTH);

        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
        sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(1, SortOrder.ASCENDING))); // 1 là chỉ số cột của tên tour
        table.setRowSorter(sorter);
        
        JComboBox<String> sortComboBox = new JComboBox<>(new String[]{"Sort by name", "Sort by area", "Sort by numofday", "Sort by quantity"});
        sortComboBox.addActionListener(e -> {
            String selectedOption = (String) sortComboBox.getSelectedItem();
            switch (selectedOption) {
                case "Sort by name":
                    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(1, SortOrder.ASCENDING))); // sắp xếp theo tên tour
                    break;
                case "Sort by area":
                    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(2, SortOrder.ASCENDING))); // sắp xếp theo khu vực
                    break;
                case "Sort by numofday":
                    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(3, SortOrder.ASCENDING))); // sắp xếp theo số ngày đi tour
                    break;
                case "Sort by quantity":
                    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(4, SortOrder.ASCENDING))); // sắp xếp theo số lượng người tham gia
                    break;
            }
        });

        // Thêm bảng vào frame
        JScrollPane scrollPane = new JScrollPane(tourTable);
        add(scrollPane, BorderLayout.CENTER);

        // Tùy chỉnh frame
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TourTable();
    }
}
